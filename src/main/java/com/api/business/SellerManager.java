package com.api.business;

import com.api.repository.SellerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class SellerManager {
    private final SellerRepository sellerRepository;
}
