[java.txt](https://github.com/user-attachments/files/27854409/java.txt)
socket.on("users", (users) => {
    document.getElementById("users").innerHTML =
        Object.entries(users)
        .map(([id, name]) =>
            `<div class="player" onclick="privateMsg('${id}')">
                🎖️ ${name}
                <br><small>${id}</small>
            </div>`
        ).join("");
});
