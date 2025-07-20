let books = new Array();
function addBook(Id,title,author,price,quauniyty){
let book = {
    id:Id,
    title:title,
    author:author,
    price:price,
    quauniyty:quauniyty
}
 books.push(book);
}
function removeBook(ind){
    let index = books.findIndex(book=>book.id ===ind);
    if(index !== -1){
    books.splice(index,1)
    console.log(`the book ${books.ind} have been deleated`);
}
}
function show(id,title,author){
    let found = false;
  for(let i of books){ // now each itertion i will take the value and than cahnge
   if (i.id ===id && i.author === author && i.title === title){
    console.log(i);
    found = true;
   }
  }
   if(!found){
    console.log(`sorry there is no such book like that`);
  
   }
}
function buy(title,quauniyty,balnce){
    let book = books.find(book=>book.title===title);
if (!book){
    console.log("sorry the book isn't avalabe");
    return;
}
if (book.quauniyty <quauniyty){
    console.log(`the quantity that you have ask is not avelable
        in storge:${book.quauniyty} `);
        return;
}
let totalP = book.price * quauniyty;
    if(totalP>balnce){
        console.log(`sorry you have low balance 
            the total:${totalP}`);
            return;
    }
    book.quauniyty -= quauniyty;
    
        console.log(`your racciet 
            the book:${title}
            price :${book.price}
            we hope you viset us agian`
        );
    
    
}

addBook(1, "JavaScript", "Ali", 100, 5);
addBook(2, "Python", "Sara", 150, 3);
addBook(3, "C++", "Khalid", 120, 2);
addBook(4, "Java", "Ahmed", 130, 4);
addBook(5, "HTML & CSS", "Laila", 80, 6);
console.log("--------------------------------------");
show(3, "C++", "Khalid");
show(6, "React", "Ali");
console.log("--------------------------------------");
buy("Python", 2, 500);  // كمية متاحة ورصيد كافي
buy("Java", 3, 200); // السعر 130 × 3 = 390 > 200
buy("HTML & CSS", 10, 1000); // فقط 6 موجودة
buy("React", 1, 500);
removeBook(2); 
show(2, "Python", "Sara"); // راح يعطي: "no such book"// حذف كتاب Python