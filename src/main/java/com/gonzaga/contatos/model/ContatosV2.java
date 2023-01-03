package com.gonzaga.contatos.model;

import lombok.Data;
@Data
public class ContatosV2 {

    private String id;
    private String nome;
    private boolean ativo = true;
    private Long documento;

}
