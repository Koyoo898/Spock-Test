package com.example.spock.service;

import java.util.List;

public interface NumberService {

  double getAverage(List<Integer> numbers);

  int addNumbers(int first, int second);
}
