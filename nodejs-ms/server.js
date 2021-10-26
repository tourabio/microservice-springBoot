"use strict";

const express = require("express");
const eurekaConfig = require("./eurekaConfig");
var cors = require("cors");

require("./database/db");
eurekaConfig.registerWithEureka();
const userApi = require("./routes/userApi");

const app = express();
app.use(cors());
app.use(express.json());
app.use(express.urlencoded({ extended: true }));
app.use("/api/v1", userApi);

app.get("/", (req, res) => {
  res.send("hello world");
});

const PORT = process.env.PORT || 5000;

app.listen(
  PORT,
  console.log(`server running in ${process.env.NODE_ENV} mode on port ${PORT}`)
);
