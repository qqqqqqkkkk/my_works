import login from '../functions/login'
import { useState } from 'react';
import '../styles/login.scss'

function Login(){
    const [username,setUsername] = useState('')
    const [password,setPassword] = useState('')

    return(
        <>
            <div className="main">
                <h1 className="hello">
                    Welcome
                </h1>
                <div className="form">
                    <input className='username' type="text" placeholder='your username' value={username} onChange = {(e)=> setUsername(e.target.value)}/>
                    <input className='password' type="text" placeholder='your password' value={password} onChange = {(e) => setPassword(e.target.value)}/>
                    <button onClick={()=>{if(username != '' && password !== '')login(username,password);else{alert("请输入完整的用户名或密码")}}}>login</button>
                </div>
            </div>
        </>
    )
}

export default Login;