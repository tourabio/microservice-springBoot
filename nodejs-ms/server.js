"use strict";

const express = require("express");
const eurekaConfig = require("./eurekaConfig");

const app = express();
eurekaConfig.registerWithEureka();
app.get("/", (req, res) => {
  res.send("hello world");
});

app.listen(3100);
