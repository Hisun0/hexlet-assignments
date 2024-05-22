@import exercise.dto.MainPage
@import exercise.util.NamedRoutes
@param MainPage page

@template.layout.page(
    content = @`
        <div class="container">
            @if(page.getName() != null)
                <p>Добро пожаловать, ${page.getName().toString()}</p>
                <form action="${NamedRoutes.logoutPath()}" method="post">
                    <input type="submit" class="btn btn-danger" value="Выйти">
                </form>
            @else
                <p>Добро пожаловать!</p>
                <a href="${NamedRoutes.buildSessionPath()}"><button class="btn btn-primary">Войти</button></a>
            @endif
        </div>
    `
)