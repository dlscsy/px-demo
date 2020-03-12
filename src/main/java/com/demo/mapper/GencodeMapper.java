package com.demo.mapper;


import com.demo.entity.Gencode;
import com.demo.util.MyMapper;

import java.util.List;

public interface GencodeMapper extends MyMapper<Gencode> {

    List<Gencode> getBaseInfo(Gencode gencode);
}