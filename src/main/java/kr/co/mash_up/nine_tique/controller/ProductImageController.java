package kr.co.mash_up.nine_tique.controller;

import kr.co.mash_up.nine_tique.dto.ProductImageDto;
import kr.co.mash_up.nine_tique.service.ProductImageService;
import kr.co.mash_up.nine_tique.util.ParameterUtil;
import kr.co.mash_up.nine_tique.vo.DataListResponseVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping(value = "/api/product_image")
public class ProductImageController {

    @Autowired
    private ProductImageService productImageService;

    @PostMapping
    public DataListResponseVO<ProductImageDto> add(@RequestParam(name = "files") List<MultipartFile> files) {
        ParameterUtil.checkParameterEmpty(files);

        List<ProductImageDto> productImageDtos = productImageService.create(files);

        return new DataListResponseVO<ProductImageDto>(productImageDtos);
    }
}