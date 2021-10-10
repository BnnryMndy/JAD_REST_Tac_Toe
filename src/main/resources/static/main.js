$( document ).ready(function() {
    $( "#addButton" ).bind( "click", AddForm);
    getUsers();
});

function AddForm() {
    $( "#addButton" ).after("<div id='addUserForm'></div>");
    $( "#addUserForm" ).load("blocks/registerClient.html");
    $( "#addButton" ).remove();
}

function ListUsers(usersList){
    usersList.forEach(element => {
        $('tbody').append('<tr>'+
        '<th scope="row">'+element.id+'</th>'+
        '<td>'+element.client_name+'</td>'+
        '<td>'+element.email+'</td>'+
        '<td>'+element.phone+'</td>'+
    '</tr>');
    });
}

function getUsers(){
    $.ajax({
        type: "GET",
        crossDomain: true,
        url: "http://127.0.0.1:8080/clients",
        success: function(data) {
            ListUsers(data)
        }
    })
}