package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.repository.modelo.Cliente;
import com.example.demo.repository.modelo.Reserva;
import com.example.demo.repository.modelo.Vehiculo;
import com.example.demo.repository.modelo.dto.ReservaDto;
import com.example.demo.service.IClienteService;
import com.example.demo.service.IReservaService;
import com.example.demo.service.IVehiculoService;

@Controller
@RequestMapping("/clientes")

public class ClienteController {

	@Autowired
	private IClienteService clienteService;

	@Autowired
	private IVehiculoService vehiculoService;

	@Autowired
	private IReservaService reservaService;

	// http://localhost:8080/clientes/opciones
	@GetMapping("/opciones")
	public String vistaCliente() {
		return "vistaCliente";
	}

	// http://localhost:8080/clientes/registrarCli
	@GetMapping("/registrarCli")
	public String vistaRegistrarCliente(Cliente cliente) {
		return "vistaRegistrarCliente";
	}

	// http://localhost:8080/clientes/insertar
	@PostMapping("/insertar")
	public String insertarCliente(Cliente cliente) {
		cliente.setRegistro("C");
		this.clienteService.registrarC(cliente);
		return "ClieGuardado";
	}

	// buscar por placa y modelo
	@GetMapping("/busquedaMarcayModelo")
	public String vistaBuscarMarcayModelo(Model model, @Param("marca") String marca, @Param("modelo") String modelo) {
		List<Vehiculo> vehiculos = this.vehiculoService.buscarMarcayModeloList(marca, modelo);
		model.addAttribute("marca", marca);
		model.addAttribute("modelo", modelo);
		model.addAttribute("vehiculos", vehiculos);
		return "vistaBuscarVehiculoMarcayModelo";
	}

	// http://localhost:8080/clientes/registrarReserva
	@GetMapping("/registrarReserva")
	public String vistaInsertarReserva(Model model) {
		model.addAttribute("reserva", new ReservaDto());
		return "vistaRegistrarReserva";
	}

	// http://localhost:8080/clientes/reservar
	@PostMapping("/reservar")
	public String insertarReserva(@ModelAttribute ReservaDto dto, RedirectAttributes attributes) {
		String mensaje = this.reservaService.reservarRetorno(dto.getPlaca(), dto.getCedula(), dto.getInicio(),
				dto.getFin(), dto.getNumeroTarjeta());
		if (mensaje.equals("Reserva Exitosa")) {
			// CREAR EN ESTE REDIRECT QUE NOS MANDE A UNA PAGINA NUEVA QUE DIGA RESERVA
			// EXITOSA
			return "redirect:/clientes/reservaExitosa"; // Redirige a la lista de reservas
		} else {
			attributes.addFlashAttribute("mensajeError", mensaje);
			return "redirect:/clientes/registrarReserva";// Redirige de vuelta al formulario
		}
	}

	// http://localhost:8080/clientes/reservaExitosa
	@GetMapping("/reservaExitosa")
	public String vistaReservaExitosa(Reserva reserva, Model model) {

		List<Reserva> reservas = this.reservaService.buscarTodasReserva();
		model.addAttribute("reservas", reservas);
		return "vistaReservaExitosa";
	}

}
