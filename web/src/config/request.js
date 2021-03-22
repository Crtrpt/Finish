import server from "./server.js";
// import { sha256 } from 'js-sha256';

const sign=function (params) {

  params=params+"&t="+((new Date()).valueOf()*1000-1605367991000)+"&";
  // const signStr=  sha256(params).substring(0,10)
  params=params+"sign="+signStr;
  return params
}

const serialize = function(obj) {
  var str = [];
  for (var p in obj)
      // eslint-disable-next-line no-prototype-builtins
      if (obj.hasOwnProperty(p)) {
          str.push(encodeURIComponent(p) + "=" + encodeURIComponent(obj[p]));
      }
      
  return str.join("&");
}

const request={
  post:(url,data)=>{
   return fetch(server.endpoint+url,{
        method:"POST",
        body: JSON.stringify(data),
        headers: new Headers({
          'Content-Type': 'application/json'
        })
    })
    .then(function(response) {
      return response.json();
    })
  },
  get:(url,data)=>{
    var queryString=serialize(data);
    if(queryString==""){
        queryString=""
    }else{
        queryString="?"+queryString
    }
    return fetch(server.endpoint+url+queryString,{
      method:"GET",
      headers: new Headers({
        'Content-Type': 'application/json'
      })
    })
    .then(function(response) {
      return response.json();
    })
  }
}

export default  request;