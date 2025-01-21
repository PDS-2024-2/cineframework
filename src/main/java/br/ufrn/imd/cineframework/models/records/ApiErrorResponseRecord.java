package br.ufrn.imd.cineframework.models.records;

public record ApiErrorResponseRecord(Integer status, String url, String message) {

}