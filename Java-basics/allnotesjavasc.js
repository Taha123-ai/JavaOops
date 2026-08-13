// const name="   taha jamal  \uD800"
// console.log(name.slice(-2,3));
// console.log(name.substring(-2,3));
// console.log(name.isWellFormed())
// console.log(name.toWellFormed())
// console.log(name.replace(/taha/i,"khan"))
// console.log(name.padStart(20,"*"))
// // let text= "jamal".conc000 "+name)
// // console.log(text);
// console.log(name.fontcolor("blue"));
// // console.log(name.length);
// // console.log(name.Upper);
// // let age=18
// // console.log(`My name is ${name}. I am ${age} years old.`);
// // console.log(`you are my 
// // bad`)
  

// let x="255.7622";
// // console.log(typeof x)
// // a=x.toExponential(     2 );
// // console.log(x.toFixed(2));
// // console.log(x.toPrecision(4));
// // console.log(x.valueOf())
// // console.log(x.Number())
// console.log(parseInt(x))
// console.log(parseFloat(121.21))



//Maths+++++++++++++++++++

// console.log(Math.E)
// console.log(Math.PI)
// console.log(Math.LN2)
// console.log(Math.sqrt(25))
// let x=23.96;
// console.log(Math.round(x))
// console.log(Math.ceil(x))
// console.log(Math.floor(x))
// let min=4,max=3;
// console.log(Math.floor((Math.random()*(max-min+1))+min))


// // const object={ Name:"Taha",class:"12",age:"21"}
// const object={ Name :{
//     name1:"Taha",name2:"Farzan",name3:"sameer"},
//     Class:{person1:"21",person2:"23",person3:"54"},
//     Age:{age1:"32",age2:"43",age3:"51"},
//     Data:function(){return (object.Name.name1+","+this.Class.person1+","+this.Age.age1).toUpperCase()}
// }


// function myobject(anyobject){
//     return anyobject.Age.age1;
// }

// console.log(myobject(object))
// console.log(object.Data());


// function Person(first, last, age, eye) {
//     this.firstName = first;
//     this.lastName = last;
//     this.age = age;
//     this.eyeColor = eye;
// }
// const myFather = new Person("John", "Doe", 50, "blue");
// console.log(myFather.age);




// console.log(object);
// console.log(object.Name.name3);
// delete object.Age
// console.log(object);

// name(){}
// name=(num1,num2)=>({num:num1+num1})
// console.log(name(1,1))

// function name(){
//     let naam="taha"
//     console.log(this.naam)
// }
// name();

// const ob={
//     naam:"taha",
//     gwet:function(){
//     return `hello ${this.naam}`
//     }
//     }
// console.log(ob.gwet())

// let add=(num1,num2)=>{
//     let sum=num1+num2
//     console.log(this.sum)
// }
// add(1,2)


// (function namedIIFE(names) {
//     console.log(`hi ${names}`)
// })("taha");

// ((names) => {
//     console.log(`hi ${names}`)
// })("taha");

// foreach loop

// const arr=[
//     {
//         languagename:"English",
//         person:"Taha"
//     },
//     {
//         languagename:"Hindi",
//         person:"zeeshan"
//     }
// ]
// arr.forEach((value)=>{console.log((value.languagename));
// })
// arr.forEach((value)=>{console.log(value)})


// const brr=["taha",12,"jamal"]
// for(const val in brr){
//     console.log(val)
// }


// const   object={
//     name:"Taha",
//     class:'12',
//     age:"21"
// }

// for(const val in object){
//     console.log(`${val} ->${object[val]}`);

// }

// Array methods:


// console.log(arr.length);
// console.log(arr.toString());
// console.log(arr.at(3));
// console.log(arr.join("*")); join two array
// arr.pop() //removes only laast
// arr.push('king') add from last
// arr.shift(); removes from first
// arr.unshift("add") add from first
// Array.isArray(arr) check it array or Not
// delete arr[arr.length-1] //removes Element with hole
// console.log(arr.concat(arr2,arr3));//concat and return new arr

// arr.splice(1,4,"aa","as")//1 for addition on index 1 and 4 to remove 4element from 1 to4 
// console.log(arr2.slice(0,1));//copy part of array
// console.log(arr.sort());//alphabetically sort
// console.log(arr.reverse());//reversse array



// Map,reduce,filter
// const arr=[1,2,3,4.5,6,7,7,8]
// let arnew=arr.map( (val) =>val*10).filter( (val)=>{return val>3})
// let arr2=arr.filter( (val)=>{return val>3})
// let arr3=arr.reduce( (start,val)=>{ return start+val},0)
// console.log(arr3);
