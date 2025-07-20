let stds = new Array();

function add (id , name, grade,mark){
    let studnt = {
        national_id :id,
        name:name,
        grade:grade,
        mark:mark
    }
    stds.push(studnt);
    console.log(`student ${name} been add sucsccfully`);

}

function show_byID(id){
    let find = stds.find(studnt=>studnt.national_id===id);
    if(!find){
        console.log(`sorry but this id:${id} is not in the system`);
        return;
    }
    console.log(`student found!!
        name:${find.name}, oubtend grade:${find.grade}`);
}

function grad (grade,chose){
    
    switch (chose){
        case 1:{
            let grads = stds.filter(std=>std.grade>=grade);
            grads.forEach(std=>{
                console.log(`student ${std.name} got ${std.grade}`);
            }
    )
            break;
        }
        case 2:{
            let grads = stds.filter(std=>std.grade<=grade);
            grads.forEach(std=>{
                console.log(`student ${std.name} got ${std.grade}`);
            })
            break;
        }
        case 3: {
            let grads = stds.filter(std=>std.grade===grade);
            grads.forEach(std=>{
                console.log(`student ${std.name} got ${std.grade}`);
            })
            break;
        }
        default:{
            console.log(`wroing choice `);
            break;
        }
    }
    
}

function remove (id){
    let find = stds.findIndex(std=>std.national_id===id);
    if(find===-1){
        console.log(`sorry bot the id:${id} is not in the system`)
    }
    console.log(`student :${stds.name} his been removed`)
    stds.splice(find,1);
}



let out = false;

while(!out){
    let choice = parseInt(prompt(`welcome to saeed system 
        for adding a new studnt press 1 
        for search a student by id prees 2
        for grades prees 3
        for removeing a student prees 4`));
        switch (choice){
            case 1: {
                while(true){
                let id = parseInt(prompt(`enter the id of the student:`));
                let name = prompt('enter the name:');
                let grade = parseInt(prompt(`plese enter the gerde:`));
                add(id,name,grade);
                let again = parseInt(prompt("Add another student? (1 = Yes, 0 = No):"));
                if (again !== 1) break;
                }
                 break;
                }
            
            
            case 2:{
                while(true){
                let id = parseInt(prompt("enter the id:"));
                show_byID(id);
                let chose = parseInt(prompt(`if you want conuinte you press 1 out press 0:`));
                if (chose ===0){
                    break;
                }
                let again = parseInt(prompt("Search for another student? (1 = Yes, 0 = No):"));
                if (again !== 1) break;
                }
                break
            }
            case 3:{
                while(true){
                let choseGrade = parseInt(prompt(`for greter the grade press 1
                    for less than press 2 
                    for eqiule press 3`));
                let grade = parseInt(prompt('enter the grade'));
                grad(grade,choseGrade);
                let again = parseInt(prompt("Search for another grade? (1 = Yes, 0 = No):"));
                if (again !== 1) break;
                }
                break;
                }
            case 4:{
                while(true)
                {
                let id = parseint(prompt(`enter the id :`));
                remove(id);
                let again = parseInt(prompt(" delete another student? (1 = Yes, 0 = No):"));
                if (again !== 1) break;
            }
                break;
            }
            default:{
                out = true;
                break;
            }

        }

}