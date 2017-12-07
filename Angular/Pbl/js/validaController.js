var app = angular.module("app",[]);
app.controller("validaController",function($scope){
	$scope.pessoa = [];



	$scope.anoAtual = (new Date()).getFullYear();


	$scope.meses = [
		{"id":1,"mes":"Janeiro"},
		{"id":2,"mes":"Fevereiro"},
		{"id":3,"mes":"Março"},
		{"id":4,"mes":"Abril"},		
		{"id":5,"mes":"Maio"},
		{"id":6,"mes":"Junho"},
		{"id":7,"mes":"Julho"},
		{"id":8,"mes":"Agosto"},
		{"id":9,"mes":"Setembro"},
		{"id":10,"mes":"Outubro"},
		{"id":11,"mes":"Novembro"},
		{"id":12,"mes":"Dezembro"}
	]

	$scope.listemail = [
		{"email":"teste@teste.com"},
		{"email":"teste1@teste1.com"},
		{"email":"123@123.com"},
		{"email":"fran@hotmail.com"},
		{"email":"fran@gmail.com"},
		{"email":"senai@hotmail.com"},
		{"email":"senaiteste@hotmail.com"},
		{"email":"hotmail@hotmail.com"}
		{"email":"fran.almeida1996@gmail.com"}
	]


	$scope.local = [
		{"cidade":"Salvador"},
		{"cidade":"São Paulo"},
		{"cidade":"Rio de Janeiro"},
		{"cidade":"Florianopolis"},
		{"cidade":"Sergipe"},
		{"cidade":"Natal"},
	]
});