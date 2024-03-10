package com.ndambodevs.inventoryservice.controller;

import com.ndambodevs.inventoryservice.dto.InventoryResponse;
import com.ndambodevs.inventoryservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventroy")
@RequiredArgsConstructor
public class InventoryController {

    private InventoryService inventoryService;
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<InventoryResponse> isInStock(@RequestParam List<String> skuCode){

        return inventoryService.isInStock(skuCode);
    }
}
