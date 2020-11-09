package com.froneus.app.service.b.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.froneus.app.service.b.dto.MessageDTO;

@FeignClient(name="node-transcriptor", url="localhost:3000/transcriptor/api/transcribe")
public interface NodeTranscriptorRestClient {

	@GetMapping
	public MessageDTO traduce();
}
