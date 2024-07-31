let obj1 = {
    firstName : "Abdul",
    secondName : "Moid",
    city : "Lucknow",
    state : "UP",
    PIN_Code : 144411,
    phoneNo : 123456890,
}


// const firstName = obj1['firstName'];

// const address = obj1['city']

// console.log(firstName);
// console.log(address);


// Destructuring of object
// const {firstName, PIN_Code} = obj1;
// default parameter can also be used as here fatherName is used
// console.log(fatherName = "Mutiullah", firstName, PIN_Code);

// const {firstName : fname, secondName : sname} = obj1;
// console.log(fname, sname);


// Array Destructuring

const arr = [1, 2, 3, 4, 5] 
let [a, b, c, ...d] = arr;

console.log(a,b,c,d);

// Array of object

let arrObj = [
    {
        firstName : "Abdul",
        secondName : "Moid",
    },

    {
        firstName : "Asaad",
        secondName : "Khan",
    },
]

// const [obj2, obj3] = arrObj;
// console.log(obj2, obj3);

// const {firstName, secondName} = obj2;
// console.log(firstName, secondName);

let listObj = {
    firstName : ["a", "b", "c", "d"],
    secondName : ["x", "y", "z"]
}

let {firstName, secondName} = listObj;

const [l, ...m] = firstName;
const [j, ...k] = secondName;
// console.log(l, j);



let copy  = {
    name : "Abdul Moid",
     course : "B.Tech",
      Address : {city : "Delhi", PIN_Code : 123456},
    }


// copying object 
// let copy1 = copy;
// console.log(copy)
// console.log(copy1);

// doing changes in copied object will Reflect in the actual object in this way
// copy1["name"] = "Asaad";
// console.log(copy)
// console.log(copy1);



// shallow copy -> Using destructuring it will work properly and will not affect 
let copy2 = {...copy}
copy2['name'] = "Asaad";
copy2['Address']['city'] = "Lucknow"; // it will reflect in original also
console.log(copy)
console.log(copy2);


const myName = () => {
    return "Abdul Moid"
}

module.exports = myName;

