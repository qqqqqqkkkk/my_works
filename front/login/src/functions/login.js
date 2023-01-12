import axios from "axios";

export default function findPerson(username,password){
    
    axios.get('http://localhost:8080/login/' + username + '/' + password).then((data) => {
        if(data.data.exist === false)alert("对不起，查无此人")
        else{
            alert("欢迎！")
        }
    })
}