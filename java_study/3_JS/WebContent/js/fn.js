/**
 *  
java scipt func
	javascript 함수 특징 
	
	-javascript 함수는 일급 함수, 고차함수
	-함수가 값입니다.
	-변수에 함수를 대입 시킬수 있다.
	-함수를 리턴할수도 있다.
	-함수의 인자로 함수 사용 가능

 */
console.log("fn.js");
//let name = "홍길동";
let flag = 99>100;
let now = new Date();
//let num = 999;

console.log(typeof(flag));
const pi = 3.141592;

const log = console.log;

//name  = prompt('이름은?');
//num  = prompt('점수는');

function f1(){
	alert("hello !")
}

const f2 = f1;

const f3 = function (){
			alert("hello !")
			} 
			
const f4 = (i) => alert(i); 			

const hell = (i) => "hello" + i;


function small(a,b){
	if(a>b) return b;
	else return a;	
}

const min =(a,b)=> a>b ? b:a;

function callback(){
	console.log('callback 출력')
}

function callTenTimes(fn){
	for(let i=0;;){
		
	}
}





