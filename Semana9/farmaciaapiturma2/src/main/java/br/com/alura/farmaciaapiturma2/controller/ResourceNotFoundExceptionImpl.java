package br.com.alura.farmaciaapiturma2.controller;

public class ResourceNotFoundExceptionImpl extends ResourceNotFoundException {
    public ResourceNotFoundExceptionImpl(String s) {
        super(s);
    }
}
