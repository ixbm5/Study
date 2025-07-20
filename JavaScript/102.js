function hi (name){
   return`hallo mr ${name}`;
}

function out(name){
    return`out mr ${name}`;
}

function op(name , oip){
    console.log(`[${oip(name)}]`);
}
/////////////////eximple on callback//////////////////////

function format(massage,opformat){
    return opformat(massage);
}

function html(masgge){
    return `<dif> ${masgge}</dif>`;
}

function json(m){
    return `massage: "${m}"`;
}
//////////////////////////
console.log(format("saeed",html));
console.log(format(`saeed`,json));


op('saeed',hi);



const d = new Date(2004,7,14);// 2004/06/15 the monthe is form 0-11 
console.log(d.getDate()); //give u the day
console.log(d.getDay());  // will give yhe day from the 0 -6 on the day from the weekend
console.log(d.getFullYear());
console.log(d.getMinutes());
console.log(d.getMonth());
console.log("///////////////////");
////////////////////////////////////////////////////////////////////////////////////////////
let num = Math.floor(9.8); // will make the numbeer lower
//ceill will make it bagger
// math.round 9.53 = 10 > 0.5 up ,0.5<low
// math.trunc  remove the fricton 
console.log(num);
let n = [1,2,3,4,5];

console.log(Math.min(...n)); // ... that's mean all the elmants wil make it n = (1,2,3,4)
const a = '1.5';
let af = parseFloat(a); // will make af = 1.5
//parsInt will make the string to int
// isInteger to make sure that is int
// is NaN to make sure if it's a number or no if true  than it's not number

