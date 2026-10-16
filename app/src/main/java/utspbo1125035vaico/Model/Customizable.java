package main.java.utspbo1125035vaico.Model;

import java.util.List;

public interface Customizable {
    void customize(List<Integer> customizable);
    void customize(int[]customizable);
    String getOrderDetail();
    int validasi(int nilai, int max);
}


