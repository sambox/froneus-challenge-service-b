package com.froneus.app.service.b.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.froneus.app.service.b.client.NodeTranscriptorRestClient;
import com.froneus.app.service.b.dto.MessageDTO;
import com.froneus.app.service.b.service.INodeEndpointConsumerService;

@Service
public class NodeEndpointConsumerServiceImpl implements INodeEndpointConsumerService {
	
	private static Logger log = LoggerFactory.getLogger(NodeEndpointConsumerServiceImpl.class);
	
	@Autowired
	private NodeTranscriptorRestClient client;

	@Override
	public MessageDTO consume() {
		MessageDTO dto;
		dto = client.traduce();
		log.info(dto.toString());
		return dto;
	}

}
