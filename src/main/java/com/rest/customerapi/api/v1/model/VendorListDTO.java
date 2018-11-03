package com.rest.customerapi.api.v1.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VendorListDTO {

    @ApiModelProperty(value = "List of vendors")
    List<VendorDTO> vendors;
}
