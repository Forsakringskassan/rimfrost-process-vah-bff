package se.fk.github.vahbff.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record PatchTaskBody(@JsonProperty("ersattning_id")String ersattningId,String yrkandestatus){}
