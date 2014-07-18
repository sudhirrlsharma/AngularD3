/*
 Test inner method
*/
var sum = function(a,b){
   return a+b;
}

function add(a,b){
    return a+b;
}
var sum1 = sum(2,3);
var add1 = add(2,4);
console.log(sum1);
console.log(add1);

function isNimble(){ return true; } 
var canFly = function(){ return true; }; 
window.isDeadly = function(){ return true; }; 

console.log(isNimble);
console.log(canFly);
console.log(isDeadly);


console.log(isNimble());
console.log(canFly());
console.log(isDeadly());

/*
var fruits = [];
fruits.push("apple");
fruits.push("banana");

 fruits.map(function(fruit){
    console.log(fruit);     
 });
            
  fruits.forEach(function(fruit){
     console.log(fruit);
 });
 

(function(){
    //alert('hi');
})();


(function(){
	return function(a,b){
	return a+b;
	}
})

*/