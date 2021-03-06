package com.boyz.mariopoirest.REST;

import com.boyz.mariopoirest.Service.MarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
public class MarioRestController {

    @Autowired
    MarioService marioService;

    @ApiOperation(value = "Get Mario by Id", response = byte.class)
    @GetMapping(value = "/mario/{id}", produces = MediaType.IMAGE_JPEG_VALUE)
    public ResponseEntity<byte[]> getPictureById(@PathVariable int id) {

        return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(marioService.getMarioBytesById(id));
    }
    @ApiOperation(value = "Get random Mario", response = byte.class)
    @GetMapping(value = "/mario/random", produces = MediaType.IMAGE_JPEG_VALUE)
    public ResponseEntity<byte[]> getRandomPicture() {

        return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(marioService.getMarioBytesRandom());
    }
}