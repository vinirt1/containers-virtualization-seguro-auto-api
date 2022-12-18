package br.com.seguro.auto.api.service;

import br.com.seguro.auto.api.model.dto.ContrataSeguroDTO;
import br.com.seguro.auto.api.model.dto.SeguroDTO;

public interface SeguroService {
    SeguroDTO contratar(final Long clienteId, final ContrataSeguroDTO contrataSeguroDTO);
}
