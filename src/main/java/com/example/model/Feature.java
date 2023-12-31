package com.example.model;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Feature {
	private int id;
	private String name;
	private boolean status;
	private List<Feature>listSubFeature=new ArrayList<>();
	private int level;
	private int stt;
}
