var Rectangle={
    width:100,
    height:100,
    getArea:function(width,height){
        var area=width*height;
    }
}
var rectangle1=function(width,height){
    this.width=width;
    this.height=height;
    this.getArea=function(width,height){
        document.write(width*height);
    };
}
var myrect=new rectangle1(100,10);
document.write(myrect.height);


var myname={
    firstname:"lokesh",
    lastname:"chary"
}
document.write(myname.firstname);
var i=myname.firstname="Ananth";
var j=myname.lastname="Kuumar";
document.write(i,j);
var k=myname.middlename="kumar";
document.write(k);



const json = '{"result":true, "count":42}';
const obj = JSON.parse(json);

console.log(obj.count);
// expected output: 42

console.log(obj.result);
// expected output: true

//question7
function person(fname, lname, age, skills, dateofbirth, address, married, profession)
{
    this.fname = fname;
    this.lname = lname;
    this.age = age;
    this.skills = skills;
    this.dateofbirth = dateofbirth;
    this.address = address;
    this.married = married;
    this.profession = profession;
}
person1=new person("nikhil","goud",22,["c"],"24/10/1996",{city:"hyderabad",pincode:"521185"},"false","sr analyst");
person2=new person("harish","chinna",21,"HTML","08/06/1997",{city:"Ameerpet",pincode:"500038"},"false","jr analyst");

print=function()
{
 console.log(person1);
 console.log(person2);
};


amithab=new person("amithab","bachan",22,["c"],"24/10/1996",{city:"hyderabad",pincode:"521185"},"false","sr analyst")
abhisheik=new person("abhisheik",21,"HTML","08/06/1997","false","jr analyst")
var abhisheik=Object.create(amithab);

Aaradhya=new person("Aaradhya",20,"null","25/10/2002","false","extra jr analyst");
var Aaradhya=Object.create(amithab,abhisheik);

print=function()
{
 console.log(amithab);
 console.log(abhisheik.lname);
 console.log(abhisheik.address);
 console.log("Aaradhya last name shared:",Aaradhya.lname);
 console.log("Aaradhya address:",Aaradhya.address);
};


function BankAccount(accountNumber,accountHolderName,accountBalance,isSalary,odLimit,amount)
{
this.accountNumber=accountNumber;
this.accountHolderName=accountHolderName;
this.accountBalance=accountBalance;
this.isSalary=isSalary;
this.odLimit=odLimit;
this.amount=amount;


if(this.isSalary==true)
{
   if(this.accountBalance>this.amount)
     {
         this.accountBalance=this.accountBalance-(this.amount);
         console.log(this.accountBalance);
     }
    else
    {
    console.log("insuufficient funds");
    }
}
else
{
     if(this.amount < this.accountBalance + this.odLimit)
      {
                  this.accountBalance =this.accountBalance- this.amount;
                  console.log(this.accountBalance);
      }
     else
     {
     console.log('Insufficient Funds');
     }
}
}
Savings=new BankAccount(100,"lokeshchary",1000,true,0,100);
Current=new BankAccount(200,"lokeshchary",2000,false,100,200);




