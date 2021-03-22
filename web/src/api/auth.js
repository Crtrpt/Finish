
import request from "../config/request.js";
const authApi ={
  login(ctx){
    return request.post("/auth/login",ctx)
  }
}

export default authApi;