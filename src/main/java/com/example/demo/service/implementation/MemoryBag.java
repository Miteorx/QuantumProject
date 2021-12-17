package com.example.demo.service.implementation;
import com.example.demo.models.Bag;
import com.example.demo.service.api.BagService;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class MemoryBag implements BagService {
    private List<Bag> bagList = new ArrayList<>(Arrays.asList(
            new Bag(1555, 555),
            new Bag(1444, 444),
            new Bag(1333, 333))
    );

    @Override
    public List<Bag> search() {
        return bagList;
    }
}
