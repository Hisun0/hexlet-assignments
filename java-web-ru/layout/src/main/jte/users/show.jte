@import exercise.dto.users.UserPage
@param UserPage page

@template.layout.page(
    content = @`
        <div class="card" style="width: 18rem;">
            <div class="card-header">
                ${page.getUser().getFirstName() + " " + page.getUser().getLastName()}
            </div>
            <ul class="list-group list-group-flush">
                <li class="list-group-item">Id: ${page.getUser().getId()}</li>
                <li class="list-group-item">Email: ${page.getUser().getEmail()}</li>
                <li class="list-group-item"><a href="/users">Вернуться обратно</a></li>
            </ul>
        </div>
    `
)
