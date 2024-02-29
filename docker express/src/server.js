const express = require('express');
const app=express();

app.get('/',(req,res) => {
    res.send("Welocme to docker express");
    console.log("Express is listening on port 3000");
});

app.listen(3000,function()
{
    console.log("Express is Listening by Faculty on ... port 3000")
})

