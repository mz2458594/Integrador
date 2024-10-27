/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;
import java.sql.Date;


@Data
@Entity
@Table(name = "SGI_DETALLEPEDIDO_TB")
public class Detalle_pedido implements Serializable{
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "c_detalle_pedido")
    private int idDetallePedido;
    
    @Column(name = "n_cantidad")
    private int cantidad;

    @Column(name = "c_pedido")
    private int idPedido;

    @Column(name = "c_producto")
    private int idProducto;

    @Column(name = "n_precio_unidad")
    private double precio;

    @Column(name = "n_monto_total")
    private double monto_total;

    @Column(name = "f_solicitud")
    private Date fechaSolicitud;

    @Column(name = "f_recepcion")
    private Date fechaRecepcion;

    
 
    
    
}