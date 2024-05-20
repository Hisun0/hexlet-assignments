@import exercise.dto.users.UsersPage;
@param UsersPage page

@template.layout.page(
content = @`
    @if(page.getUsers().isEmpty())
        <p>Пользователей не обнаружено!</p>
    @else
        <table class="table table-success table-striped">
            <thead>
            <tr>
                <th scope="col">id</th>
                <th scope="col">First Name</th>
                <th scope="col">Last Name</th>
                <th scope="col">Email</th>
            </tr>
            </thead>
            <tbody>
            @for(var user : page.getUsers())
                <tr>
                    <th scope="row"><a href="/users/${user.getId()}">${user.getId()}</a></th>
                    <td>${user.getFirstName()}</td>
                    <td>${user.getLastName()}</td>
                    <td>${user.getEmail()}</td>
                </tr>
            @endfor
            </tbody>
        </table>
    @endif
`
)