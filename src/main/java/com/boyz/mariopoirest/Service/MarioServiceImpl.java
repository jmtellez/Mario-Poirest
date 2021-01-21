package com.boyz.mariopoirest.Service;

import java.io.IOException;
import java.util.Random;

import com.boyz.mariopoirest.REST.MarioNotFoundException;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import org.springframework.util.StreamUtils;

@Service
public class MarioServiceImpl implements MarioService {

    @Override
    public byte[] getMarioBytes() {
        Random random = new Random();
        int upperBound = 11;
        int number = random.nextInt(upperBound);
        byte[] bytes;
        var imgFile = new ClassPathResource("img/" + number + ".jpg");
        try {
            bytes = StreamUtils.copyToByteArray(imgFile.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
            throw new MarioNotFoundException("Ugh...Mario not found");
        }

        return bytes;
    }

}
