console.log("hi there");
let color = "red";
console.log(color);
var c = 'red';
if (7>9){
    console.log("that's wroing!")
    
}else{
    console.log("thits right")
}
let a = `ok
thits good ${c}`
console.log(a);
console.log(a.length);
console.log(0===false);
console.log(color.split(2));
let g = [1,2,3,4,5]
let re = g.includes(7);
g.push(7); // this add emlment to the last index
let rem = g.pop(); // remove the last index
g.unshift(8);// add elemnt to the first
g.shift(); // remove the first index
console.log(g);
console.log(rem);
console.log(Array.isArray(g)); //to chack if its array
for(let num of g ){  // for of is for the array and each time num will take diffrent number
   console.log(num)
}

mytb(8);
function mytb(i){
    return i *3;
}