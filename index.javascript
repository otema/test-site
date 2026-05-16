[java script.txt](https://github.com/user-attachments/files/27854415/java.script.txt)
socket.on("message", (data) => {
    const div = document.createElement("div");
    div.className = "message";
    div.innerHTML = `<strong>${data.user}</strong>: ${data.text}`;
    document.getElementById("messages").appendChild(div);
});
