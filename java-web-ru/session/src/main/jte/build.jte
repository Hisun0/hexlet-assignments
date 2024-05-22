@import exercise.dto.LoginPage
@import exercise.util.NamedRoutes
@param LoginPage page

@template.layout.page(
    content = @`
        <div class="container">
            <ul>
                @if(page.getError() != null)
                    <li class="text-danger">${page.getError()}</li>
                @endif
            </ul>

            <form action="${NamedRoutes.loginPath()}" method="post">
                <div class="mb-3">
                    <label for="form-control-1" class="form-label">Имя пользователя</label>
                    <input type="text" name="username" value="${page.getName()}" class="form-control" id="form-control-1">
                </div>
                <div class="mb-3">
                    <label for="form-control-2" class="form-label">Пароль</label>
                    <input type="password" name="password" class="form-control" id="form-control-2">
                </div>
                <div class="mb-3">
                    <input type="submit" class="btn btn-primary">
                </div>
            </form>
        </div>
    `
)