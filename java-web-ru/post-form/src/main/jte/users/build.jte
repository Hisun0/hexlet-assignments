@template.layout.page(
    content = @`
        <form action="/users" method="post">
            <div class="mb-3">
                <label for="form-control-1" class="form-label">First Name</label>
                <input type="text" class="form-control" name="firstName" id="form-control-1">
            </div>
            <div class="mb-3">
                <label for="form-control-2" class="form-label">Last Name</label>
                <input type="text" class="form-control" name="lastName" id="form-control-2">
            </div>
            <div class="mb-3">
                <label for="form-control-3" class="form-label">Email address</label>
                <input type="email" class="form-control" name="email" id="form-control-3" placeholder="name@example.com">
            </div>
            <div class="mb-3">
                <label for="form-control-4" class="form-label">Password</label>
                <input type="password" class="form-control" name="password" id="form-control-4">
            </div>
            <div class="mb-3">
                <button type="submit" class="btn btn-primary">Sign in</button>
            </div>
        </form>
    `
)