/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   libMat.h
 * Author: rockenbah
 *
 * Created on 21 de Março de 2017, 20:22
 */

#ifndef LIBMAT_H
#define LIBMAT_H

#ifdef __cplusplus
extern "C" {
#endif

// Modelo matematico (tipo de dados)
    typedef struct libMat {
    int valorA;
    int valorB;
    }VALOR;

// Conjunto de operações (funções)
// retorna os valores dos parâmetros
    VALOR val (int a, int b) {
    struct libMat vl;
    vl.valorA = a;
    vl.valorB = b;
    return(vl);
    }
    
int soma(VALOR val){
    return val.valorA + val.valorB;
    }

int subtracao(VALOR val){
    return val.valorA - val.valorB;
    }

int multiplicacao(VALOR val){
    return val.valorA * val.valorB;
    }

int divisaoi(VALOR val){
    return val.valorA / val.valorB;
    }

float divisaor(VALOR val){
    return val.valorA / (float)val.valorB;
    }

#ifdef __cplusplus
}
#endif

#endif /* LIBMAT_H */

