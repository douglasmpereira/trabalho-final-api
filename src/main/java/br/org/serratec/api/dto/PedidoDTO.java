package br.org.serratec.api.dto;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import br.org.serratec.api.model.Cliente;
import br.org.serratec.api.model.Pedido;

public class PedidoDTO {
	private Long id;
	private LocalDate dtEmissao;
	private LocalDate dtEntrega;
	private LocalDate dtEnvio;
	private Double vlTotal;
	private String status;
	private Cliente cliente;
	private List<PedidoItemDTO> pedidoItem;
	
	public PedidoDTO(Pedido pedido) {
		super();
		this.id = pedido.getId();
		this.dtEmissao = pedido.getDtEmissao();
		this.dtEntrega = pedido.getDtEntrega();
		this.dtEnvio = pedido.getDtEnvio();
		this.status = pedido.getStatus();
		this.cliente = pedido.getCliente();
		if (pedido.getPedidoItem() != null) {
			this.pedidoItem = pedido.getPedidoItem().stream().map(pi -> new PedidoItemDTO(pi))
				.collect(Collectors.toList());
			this.vlTotal = pedido.getVlTotal();
		}	
	}

	public LocalDate getDtEmissao() {
		return dtEmissao;
	}

	public void setDtEmissao(LocalDate dtEmissao) {
		this.dtEmissao = dtEmissao;
	}

	public LocalDate getDtEntrega() {
		return dtEntrega;
	}

	public void setDtEntrega(LocalDate dtEntrega) {
		this.dtEntrega = dtEntrega;
	}

	public LocalDate getDtEnvio() {
		return dtEnvio;
	}

	public void setDtEnvio(LocalDate dtEnvio) {
		this.dtEnvio = dtEnvio;
	}

	public Double getVlTotal() {
		return vlTotal;
	}

	public void setVlTotal(Double vlTotal) {
		this.vlTotal = vlTotal;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<PedidoItemDTO> getPedidoItem() {
		return pedidoItem;
	}

	public void setPedidoItem(List<PedidoItemDTO> pedidoItem) {
		this.pedidoItem = pedidoItem;
	}
	
	
	
	
	
	
	
	
	
}
