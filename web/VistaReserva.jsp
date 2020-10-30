<%@page import="presentacion.ModeloReserva"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta
      name="viewport"
      content="width=device-width, initial-scale=1, shrink-to-fit=no"
    />
    <meta name="description" content="" />
    <meta name="author" content="" />
    <title>Proyecto Hotel</title>
    <link href="css/styles.css" rel="stylesheet" />
    <link
      href="https://cdn.datatables.net/1.10.20/css/dataTables.bootstrap4.min.css"
      rel="stylesheet"
      crossorigin="anonymous"
    />
    <script
      src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.13.0/js/all.min.js"
      crossorigin="anonymous"
    ></script>
  </head>
  <body class="sb-nav-fixed">
    <nav class="sb-topnav navbar navbar-expand navbar-dark bg-dark">
      <a class="navbar-brand" href="index.html">Proyecto Hotel</a>
      <button
        class="btn btn-link btn-sm order-1 order-lg-0"
        id="sidebarToggle"
        href="#"
      >
        <i class="fas fa-bars"></i>
      </button>
      <!-- Navbar Search-->

      <!-- Navbar-->
      <ul
        class="navbar-nav d-none d-md-inline-block form-inline ml-auto mr-0 mr-md-3 my-2 my-md-0"
      >
        <li class="nav-item dropdown">
          <a
            class="nav-link dropdown-toggle"
            id="userDropdown"
            href="#"
            role="button"
            data-toggle="dropdown"
            aria-haspopup="true"
            aria-expanded="false"
            ><i class="fas fa-user fa-fw"></i
          ></a>
          <div
            class="dropdown-menu dropdown-menu-right"
            aria-labelledby="userDropdown"
          >
            <a class="dropdown-item" href="#">Settings</a>
            <a class="dropdown-item" href="#">Recepcionista</a>
            <div class="dropdown-divider"></div>
            <a class="dropdown-item" href="login.html">Salir</a>
          </div>
        </li>
      </ul>
    </nav>
    <div id="layoutSidenav">
      <div id="layoutSidenav_nav">
        <nav class="sb-sidenav accordion sb-sidenav-dark" id="sidenavAccordion">
          <div class="sb-sidenav-menu">
            <div class="nav">
              <div class="sb-sidenav-menu-heading">Gestión</div>
              <!--Gestion Empleado-->
              <form action="ControlEmpleado" method="Post" class="nav-link">
                <div class="sb-nav-link-icon">
                  <i class="fas fa-user-cog"></i>
                </div>
                <input
                  type="submit"
                  name="acc"
                  value="Nuevo Empleado"
                  class="input-sinEstilo"
                />
              </form>
              <!--Gestion Cliente-->
              <form action="ControlCliente" method="Post" class="nav-link">
                <div class="sb-nav-link-icon"><i class="fa fa-users"></i></div>
                <input
                  type="submit"
                  name="acc"
                  value="Nuevo Cliente"
                  class="input-sinEstilo"
                />
              </form>
              <!--Gestion Habitacion-->
              <form action="ControlHabitacion" method="Post" class="nav-link">
                <div class="sb-nav-link-icon"><i class="fas fa-bed"></i></div>
                <input
                  type="submit"
                  name="acc"
                  value="Nueva Habitación"
                  class="input-sinEstilo"
                />
              </form>
              <div class="sb-sidenav-menu-heading">Gestión de Reservas</div>
              <!--Gestion Reserva-->
              <form action="ControlReserva" method="Post" class="nav-link">
                <div class="sb-nav-link-icon">
                  <i class="fas fa-concierge-bell"></i>
                </div>
                <input
                  type="submit"
                  name="acc"
                  value="Nueva Reserva"
                  class="input-sinEstilo"
                />
              </form>
            </div>
          </div>
          <div class="sb-sidenav-footer">
            <div class="small">Desarrollo Web</div>
          </div>
        </nav>
      </div>
      <div id="layoutSidenav_content">
        <main>
          <div class="container-fluid">
            <h1 class="mt-4">Gestión de Reserva</h1>

            <ol class="breadcrumb mb-4">
              <li class="breadcrumb-item"><a href="index.html">Inicio</a></li>
              <li class="breadcrumb-item active">Nueva Reserva</li>
            </ol>
            <!--DATOS-->
            <% ModeloReserva mr = (ModeloReserva)session.getAttribute("sesRes");
            %>
            <form action="ControlReserva" method="Post">
              <div class="card mb-4">
                <div class="card-header">
                  <i class="fas fa-edit"></i>
                  Datos
                </div>
                <div class="card-body">
                  <div class="form-row">
                    <div class="col-md-4 mb-3">
                      <label>Numero</label>
                      <div class="input-group">
                        <div class="input-group-prepend">
                          <span class="input-group-text"
                            ><i class="fa fa-list-ol"></i
                          ></span>
                        </div>
                        <input type="text" class="form-control" value="" />
                      </div>
                    </div>

                    <div class="col-md-4 mb-3">
                      <label>Fecha</label>
                      <div class="input-group">
                        <div class="input-group-prepend">
                          <span class="input-group-text"
                            ><i class="fas fa-calendar-alt"></i
                          ></span>
                        </div>
                        <input type="text" class="form-control" value="" />
                      </div>
                    </div>

                    <div class="col-md-4 mb-3">
                      <label>Estado</label>
                      <div class="input-group">
                        <div class="input-group-prepend">
                          <span class="input-group-text"
                            ><i class="fas fa-bell"></i
                          ></span>
                        </div>
                        <input type="text" class="form-control" value="" />
                      </div>
                    </div>
                  </div>

                  <div class="form-row">
                    <div class="col-md-4 mb-3">
                      <label>Cliente</label>
                      <div class="input-group">
                        <div class="input-group-prepend">
                          <span class="input-group-text"
                            ><i class="fa fa-users"></i
                          ></span>
                        </div>
                        <input type="text" class="form-control" value="" />
                      </div>
                    </div>

                    <div class="col-md-4 mb-3">
                      <label>Nombre</label>
                      <div class="input-group">
                        <div class="input-group-prepend">
                          <span class="input-group-text"
                            ><i class="fa fa-align-left"></i
                          ></span>
                        </div>
                        <input type="text" class="form-control" value="" />
                      </div>
                    </div>

                    <div class="col-md-4 mb-3">
                      <label>Descuento </label>
                      <div class="input-group">
                        <div class="input-group-prepend">
                          <span class="input-group-text"
                            ><i class="fas fa-coins"></i
                          ></span>
                        </div>
                        <input type="text" class="form-control" value="" />
                      </div>
                    </div>
                  </div>
                </div>
              </div>
              <!--RESERVA-->
              <div class="card mb-4">
                <div class="card-header">
                  <i class="fas fa-hotel"></i>
                  Reserva
                </div>
                <div class="card-body">
                  <!--TABLA-->
                  <div class="table-responsive">
                    <table
                      class="table table-bordered"
                      id="dataTable"
                      width="100%"
                      cellspacing="0"
                    >
                      <thead>
                        <tr>
                          <th>Código</th>
                          <th>Tipo</th>
                          <th>Precio</th>
                          <th>Dias</th>
                          <th>Importe</th>
                          <th>Acción</th>
                        </tr>
                      </thead>
                      <tfoot>
                        <tr>
                          <th>Código</th>
                          <th>Tipo</th>
                          <th>Precio</th>
                          <th>Dias</th>
                          <th>Importe</th>
                          <th>Acción</th>
                        </tr>
                      </tfoot>
                      <tbody>
                        <% for (int i = 0; i < mr.getCes().size(); i++) {%> <%
                        Object[] f =(Object[])mr.getCes().get(i); %>
                        <tr>
                          <form action="ControlReserva" method="Post">
                            <td>
                              <input
                                type="text"
                                class="form-control"
                                name="cod"
                                size="5"
                                value="<%= f[0] %>"
                              />
                            </td>
                            <td>
                              <input
                                type="text"
                                class="form-control input-sinEstilo"
                                size="15"
                                value="<%= f[1] %>"
                              />
                            </td>
                            <td>
                              <input
                                type="text"
                                class="form-control"
                                size="5"
                                value="<%= f[2] %>"
                              />
                            </td>
                            <td>
                              <input
                                type="text"
                                class="form-control"
                                size="5"
                                value="<%= f[3] %>"
                              />
                            </td>
                            <td>
                              <input
                                type="text"
                                class="form-control"
                                size="5"
                                value="<%= f[4] %>"
                              />
                            </td>
                            <td>
                              <input
                                type="submit"
                                class="btn btn-primary btn-block"
                                name="acc"
                                value="Quitar"
                              />
                            </td>
                          </form>
                        </tr>
                        <% } %>
                      </tbody>
                    </table>
                  </div>
                </div>
              </div>

              <div class="card mb-4">
                <div class="card-header">
                  <i class="fas fa-file-invoice-dollar"></i>
                  Importe
                </div>
                <div class="card-body">
                  <div class="form-row">
                    <div class="col-md-4 mb-3">
                      <label>Subtotal</label>
                      <div class="input-group">
                        <div class="input-group-prepend">
                          <span class="input-group-text"
                            ><i class="fas fa-cash-register"></i
                          ></span>
                        </div>
                        <input
                          type="text"
                          class="form-control"
                          value="<%= mr.getSubTot() %>"
                        />
                      </div>
                    </div>

                    <div class="col-md-4 mb-3">
                      <label>Descuento</label>
                      <div class="input-group">
                        <div class="input-group-prepend">
                          <span class="input-group-text"
                            ><i class="fas fa-piggy-bank"></i
                          ></span>
                        </div>
                        <input
                          type="text"
                          class="form-control"
                          value="<%= mr.getDesc() %>"
                        />
                      </div>
                    </div>

                    <div class="col-md-4 mb-3">
                      <label>Total</label>
                      <div class="input-group">
                        <div class="input-group-prepend">
                          <span class="input-group-text"
                            ><i class="fas fa-donate"></i
                          ></span>
                        </div>
                        <input
                          type="text"
                          class="form-control"
                          value="<%= mr.getTot() %>"
                        />
                      </div>
                    </div>
                  </div>
                  <!--BOTONES-->
                  <div class="form-row">
                    <div class="col-md-4 mb-3">
                      <div class="input-group">
                        <input
                          type="submit"
                          class="btn btn-primary btn-block"
                          name="acc"
                          value="Nueva Reserva"
                        />
                      </div>
                    </div>

                    <div class="col-md-4 mb-3">
                      <div class="input-group">
                        <input
                          type="submit"
                          class="btn btn-primary btn-block"
                          name="acc"
                          value="Listar Habitaciones"
                        />
                      </div>
                    </div>

                    <div class="col-md-4 mb-3">
                      <div class="input-group">
                        <input
                          type="submit"
                          class="btn btn-primary btn-block"
                          name="acc"
                          value="Grabar Reserva"
                        />
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </form>
          </div>
        </main>
        <footer class="py-4 bg-light mt-auto">
          <div class="container-fluid">
            <div
              class="d-flex align-items-center justify-content-between small"
            >
              <div class="text-muted">
                Copyright &copy; &middot; Anderson Surco 2020
              </div>
              <div>
                <a href="#">Politica de Privacidad</a>
                &middot;
                <a href="#">Terminos &amp; Condiciones</a>
              </div>
            </div>
          </div>
        </footer>
      </div>
    </div>
    <script
      src="https://code.jquery.com/jquery-3.5.1.min.js"
      crossorigin="anonymous"
    ></script>
    <script
      src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.bundle.min.js"
      crossorigin="anonymous"
    ></script>
    <script src="js/scripts.js"></script>
    <script
      src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.min.js"
      crossorigin="anonymous"
    ></script>
    <script
      src="https://cdn.datatables.net/1.10.20/js/jquery.dataTables.min.js"
      crossorigin="anonymous"
    ></script>
    <script
      src="https://cdn.datatables.net/1.10.20/js/dataTables.bootstrap4.min.js"
      crossorigin="anonymous"
    ></script>
  </body>
</html>
