@import exercise.dto.users.UsersPage

@param UsersPage page

@template.layout.page(
    content = @`
        <form action="/users" method="get">
            <input type="search" required name="term" value="${page.getTerm()}">
            <input type="submit" value="Search">
        </form>
        @if(!page.getUsers().isEmpty())
            <table class="table table-success table-striped">
                <thead>
                <tr>
                    <th scope="col">id</th>
                    <th scope="col">Name</th>
                    <th scope="col">Email</th>
                </tr>
                </thead>
                <tbody>
                @for(var user : page.getUsers())
                    <tr>
                        <th scope="row"><a href="/users/${user.getId()}">${user.getId()}</a></th>
                        <td>${user.getFirstName()} ${user.getLastName()}</td>
                        <td>${user.getEmail()}</td>
                    </tr>
                @endfor
                </tbody>
            </table>
        @endif
    `
)