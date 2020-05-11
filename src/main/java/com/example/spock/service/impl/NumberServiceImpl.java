package com.example.spock.service.impl;

import com.example.spock.service.NumberService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NumberServiceImpl implements NumberService {

  @Override
  public double getAverage(List<Integer> numbers) {
    double sum = 0;
    for(int i: numbers){
      sum += i;
    }

    return sum / numbers.size();
  }

  @Override
  public int addNumbers(int first, int second) {
    return first + second;
  }
}
