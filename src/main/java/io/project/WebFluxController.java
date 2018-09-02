/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 *
 * @author armen
 */
@RestController
@RequestMapping("/api/v2/webflux")
public class WebFluxController {
    
    
    @GetMapping("/load")
    public Flux<String> load(){
        return Flux.just("One", "Two", "Five");
    }
    
    @GetMapping("/load/user")
    public Mono<String> find(@RequestParam Long id){
        return Mono.just("Some user with id " +id);
    }
    
    
}
