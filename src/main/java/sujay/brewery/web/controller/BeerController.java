package sujay.brewery.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sujay.brewery.web.model.BeerDto;

import java.util.UUID;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {
public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId") UUID beerId){
    return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);
}
    @PostMapping
    public ResponseEntity saveNewBeer(@RequestBody BeerDto beerDto)
{
    return new ResponseEntity(HttpStatus.CREATED);
}
    @PutMapping("/{beerId}")
    public ResponseEntity updateBeerId(@PathVariable("beerId")  UUID beerId,@RequestBody BeerDto beerDto )
{
    return new ResponseEntity(HttpStatus.NO_CONTENT);
}

}
