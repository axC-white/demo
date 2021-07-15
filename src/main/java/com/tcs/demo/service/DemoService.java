package com.tcs.demo.service;

import com.tcs.demo.data.DemoData;
import com.tcs.demo.model.Info;
import com.tcs.demo.repository.DemoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DemoService {

    private final DemoRepository demoRepository;

    public Info fetchInfo(String id) {
        Optional<DemoData> demoData = demoRepository.findById(Integer.valueOf(id));
        if (demoData.isPresent()) {
            return new Info(id, demoData.get().getName());
        } else {
            // todo exception handling
        }
        return null;
    }
}
