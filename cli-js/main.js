import fs from "fs/promises";

const userReportPath = new URL("../reports/users.json", import.meta.url);

const users = await fs.readFile(userReportPath, "utf-8");

const userSQLString = JSON.parse(users)
  .map((user) => {
    for (const key in user) {
      if (typeof user[key] === "string") {
        user[key] = user[key].replace("'", "''");
      }
    }

    const { id, username, first_name, last_name, email, avatar, password } =
      user;

    return `INSERT INTO users VALUES(${id},'${username}','${first_name}','${last_name}','${email}','${avatar}','${password}');`;
  })
  .join("\n");

const userSQLPath = new URL("../db/seeds/users.sql", import.meta.url);

await fs.writeFile(userSQLPath, userSQLString);
